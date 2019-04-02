package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006385 Number of connected planar maps with n edges.
 * @author T. R. S. Walsh
 * @author Sean A. Irvine
 */
public class A006385 implements Sequence {

  protected static final int MAX_EDGES = 30;
  protected static final int DIM = 2 * MAX_EDGES + 1;

  protected static final int OPEN_PAREN = 0;
  protected static final int CLOSE_PAREN = -1;
  protected static final int OPEN_BRACKET = 2;
  protected static final int CLOSE_BRACKET = 1;
  protected static final int DELETED = -2;

  protected final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  protected final int[] mP = new int[DIM];
  protected final int[] mQ = new int[DIM];
  protected final int[] mQMate = new int[DIM];
  protected final int[] mPMate = new int[DIM];
  protected final int[] mSMate = new int[DIM];
  protected final int[] mS = new int[DIM];
  protected final int[] mPr = new int[DIM];
  private final int[] mPrPos = new int[DIM];

  protected long mTotal = 0;
  protected long mTotalSensed = 0;

  /* Reusable stacks, should only be used with a single simple method. */
  private final int[] mStack1 = new int[MAX_EDGES];
  private final int[] mStack2 = new int[MAX_EDGES];

  protected String lehman(final int e) {
    final StringBuilder sb = new StringBuilder();
    for (int i = 1; i <= 2 * e; ++i) {
      switch (mS[i]) {
        case OPEN_PAREN:
          sb.append(" (");
          break;
        case CLOSE_PAREN:
          sb.append(" )");
          break;
        case OPEN_BRACKET:
          sb.append(" [");
          break;
        case CLOSE_BRACKET:
          sb.append(" ]");
          break;
        default:
          throw new RuntimeException();
      }
    }
    return sb.toString();
  }

  /**
   * Count planar maps.
   * @param rt type of maps
   * @param e number of edges
   * @param vmn minimum number of vertices
   * @param vmx maximum number of vertices
   * @param lehman true to print the Lehman code
   * @return total number of planar maps
   */
  long planarCount(final int rt, final int e, final int vmn, final int vmx, final boolean lehman) {
    assert e >= 0 && e <= MAX_EDGES;
    final int[] vert = new int[DIM];
    final int[] next = new int[DIM];
    final int[] code = new int[DIM];
    final int[] prev = new int[DIM];
    final long[] sensed = new long[DIM];
    final long[] unsensed = new long[DIM];
    long sumu = 0;
    mTotal = 0;
    mTotalSensed = 0;

    for (int v = vmn; v <= vmx; ++v) {
      final int np = v - 1;
      final int nq = e - np;
      long root = 0;
      long ct = 0;
      firstBracket(nq);
      do {
        if (bracketPairs(nq)) {
          throw new RuntimeException("Invalid bracket system.");
        }
        firstParenthesis(np);
        do {
          if (parenthesisPairs(np)) {
            throw new RuntimeException("Invalid parenthesis system.");
          }
          firstSys(np, nq);
          do {
            if (reject(e)) {
              continue;
            }
            ++ct;
            ++root;
            ++mTotal;
            if (lehman) {
              System.out.printf("%5d:", ct);
              System.out.print(lehman(e));
            }
            if (rt > 0) {
              decode(e, vert, next);
              if (rejectDecode(e, vert)) {
                continue;
              }
              boolean max = true;
              for (int r = 2; r <= 2 * e; ++r) {
                if (alfred(e, v, vert, next, r, code, 1)) {
                  max = false;
                  break;
                }
              }
              if (max) {
                ++sensed[v];
                ++mTotalSensed;
                if (lehman) {
                  System.out.printf("  Sensed map #%d.", sensed[v]);
                }
                if (rt > 1) {
                  for (int i = 1; i <= 2 * e; ++i) {
                    prev[next[i]] = i;
                  }
                  for (int r = 1; r <= 2 * e; ++r) {
                    if (alfred(e, v, vert, prev, r, code, 1)) {
                      max = false;
                      break;
                    }
                  }
                  if (max) {
                    ++unsensed[v];
                    ++sumu;
                    if (lehman) {
                      System.out.printf(" Unsensed map #%d.", unsensed[v]);
                    }
                  }
                }
              }
            }
            if (lehman) {
              System.out.println();
            }
          } while (nextSys(np, nq));
        } while (nextParenthesis(np));
      } while (nextBracket(nq));
      if (mVerbose) {
        System.out.printf("%3d%4d", e, v);
        System.out.printf("%12d%n", root);
      }
    }
    if (mVerbose) {
      System.out.printf("%3d sum", e);
      System.out.printf("%12d%n", mTotal);
      if (rt > 0) {
        dumpTable("Number of sensed planar maps with e edges and v vertices", sensed, mTotalSensed, vmn, vmx, e);
        if (rt > 1) {
          dumpTable("Number of unsensed planar maps with e edges and v vertices.", unsensed, sumu, vmn, vmx, e);
        }
      }
    }
    return sumu;
  }

  protected boolean rejectDecode(final int e, final int[] vert) {
    return false; // Accept everything by default
  }

  protected static void dumpTable(final String header, final long[] counts, final long sum, final int vmn, final int vmx, final int e) {
    System.out.println();
    System.out.println(header);
    System.out.println("  e   v");
    for (int v = vmn; v <= vmx; ++v) {
      System.out.printf("%3d%4d", e, v);
      System.out.printf("%12d%n", counts[v]);
    }
    System.out.printf("%3d sum", e);
    System.out.printf("%12d%n", sum);
  }

  protected boolean reject(final int e) {
    return false; // Accept everything by default
  }

  /* Constructs the Lehman code for the planar map defined by vert and next rooted at r. */
  protected boolean alfred(final int e, final int v, final int[] vert, final int[] next, final int r, final int[] code, final int c) {
    int d, i;
    final int[] el = new int[2 * e + 1];
    final int[] vl = new int[v + 1];
    d = r;
    vl[vert[d]] = 1;
    for (i = 1; i <= 2 * e; ++i) {
      if (el[d] == 0) {
        // The edge containing d is seen for the first time.
        if (vl[vert[2 * e + 1 - d]] == 0)  {
          // The vertex at the other end of this edge not yet seen.
          el[d] = -1;
          el[2 * e + 1 - d] = -1; // Put this edge in the tree.
          code[i] = 0; // left parenthesis
          vl[vert[2 * e + 1 - d]] = 1; // Now we've seen this vertex.
        } else  {
          // The vertex at the other end of this edge has already been seen.
          el[d] = 1;
          el[2 * e + 1 - d] = 1; // Put this edge in the cotree.
          code[i] = 2;
        }
      } else {
        code[i] = el[d]; // The edge containing d is seen for the second time.
      }
      if (c > 0) {
        // We're testing the code mS, decoded by vert and next, for maximality.
        if (code[i] > mS[i]) {
          return true; // The map rooted at d has a bigger code than mS.
        } else if (code[i] < mS[i]) {
          return false; // The map rooted at d has a smaller code than mS.
        }
      }
      if (code[i] <= 0) {
        d = next[2 * e + 1 - d]; // Go to the other end of the edge containing d and rotate.
      } else {
        d = next[d]; // Just rotate.
      }
    }
    return false;
  }

  /* Creates the map defined by vert and next rooted at dart 1 whose Lehman code is mS. */
  protected void decode(final int e, final int[] vert, final int[] next) {
    final int[] ds = new int[2 * e + 1];
    int vc = 1;
    int ec = 0;
    int dOld = 0;
    vert[0] = 1;
    for (int i = 1; i <= 2 * e; ++i) {
      final int d;
      if (ds[i] == 0) {
        // First occurrence of an integer or a left parenthesis.
        d = ++ec;
        ds[i] = d;
        ds[mSMate[i]] = 2 * e + 1 - d;
      } else {
        d = ds[i];
      }
      vert[d] = vert[dOld];
      next[dOld] = d;
      if (mS[i] <= OPEN_PAREN) {
        dOld = 2 * e + 1 - d;
      } else {
        dOld = d;
      }
      if (mS[i] == OPEN_PAREN) {
        vert[dOld] = ++vc;
      }
    }
    vert[1] = 1;
    next[dOld] = 1;
  }

  /* Reusable space for nextSys. */
  private final int[] mRight = new int[DIM];
  private final int[] mLeft = new int[DIM];

  protected boolean nextSys(final int np, final int nq) {
    final int sz = 2 * (np + nq);
    for (int i = 0; i <= sz; ++i) {
      mRight[i] = i + 1;
      mLeft[i] = i - 1;
    }
    mRight[sz] = 0;
    mLeft[0] = sz;
    int ipr = 2 * np;
    while (ipr > 0) {
      int ipos = mPrPos[ipr]; // the position of the parentheses having priority ipr
      int jpos = mRight[ipos];
      final int t = mS[jpos];
      if (jpos != 0 && t > 0 && (mS[ipos] == OPEN_PAREN || mSMate[ipos] <= mSMate[jpos])) {
        // the parenthesis can be moved to the right
        mS[ipos + 1] = mS[ipos];
        mS[ipos] = t;
        if (jpos > ipos + 1) {
          mSMate[ipos + 1] = mSMate[ipos];
          mSMate[mSMate[ipos]]++;
          mSMate[ipos] = mSMate[jpos];
          mSMate[mSMate[jpos]] = ipos;
          mS[jpos] = DELETED;
          mRight[ipos] = ipos + 1;
          mLeft[ipos + 1] = ipos;
          mRight[ipos + 1] = mRight[ipos];
          mLeft[mRight[jpos]] = ipos + 1;
        } else {
          final int ex = mSMate[ipos];
          mSMate[ipos] = mSMate[jpos];
          mSMate[jpos] = ex;
          mSMate[mSMate[ipos]] = ipos;
          mSMate[mSMate[jpos]] = jpos;
        }
        ++mPrPos[ipr];
        // now move the integers to replace the deleted parentheses
        jpos = sz;
        int kpos = jpos - 1;
        while (kpos >= 1) {
          if (kpos == jpos) {
            --kpos;
          } else if (mS[kpos] == OPEN_PAREN || mS[kpos] == CLOSE_PAREN) {
            jpos = kpos--;
          } else if (mS[kpos] == DELETED) {
            if (mS[jpos] > CLOSE_BRACKET) {
              --jpos;
            }
            --kpos;
          } else {
            // kpos < jpos and mS[kpos] is an integer
            if (mS[jpos] == DELETED) {
              // it's a blank - insert the integer
              mS[jpos] = mS[kpos];
              mS[kpos] = DELETED;
              mSMate[jpos] = mSMate[kpos--];
              mSMate[mSMate[jpos]] = jpos;
            }
            --jpos;
          }
        }
        // all blanks are now contiguous with nearest parenthesis to their left
        // now insert the deleted parenthesis in the blanks
        int i = 0;
        for (ipos = 1; ipos <= sz; ++ipos) {
          if (mS[ipos] <= OPEN_PAREN) {
            ++i;
            if (mS[ipos] == DELETED) {
              mS[ipos] = mP[i];
              mPrPos[mPr[i]] = ipos;
            }
          }
        }
        // now the deleted parentheses have been inserted
        // now find the mates to all the parentheses
        int ex = -1;
        for (i = 1; i <= sz; ++i) {
          if (mS[i] == OPEN_PAREN) {
            // it's a left parenthesis - save its position
            mStack1[++ex] = i;
          } else if (mS[i] == CLOSE_PAREN) {
            // it's a right parenthesis
            // the position of its mate is on the top of the stack
            mSMate[i] = mStack1[ex];
            mSMate[mStack1[ex--]] = i;
          }
        }
        return true;
      } else {
        mS[ipos] = DELETED; // it can't be moved - delete it
        mRight[mLeft[ipos]] = mRight[ipos];
        mLeft[mRight[ipos]] = mLeft[ipos];
        --ipr;
      }
    }
    return false;
  }

  protected void firstSys(final int np, final int nq) {
    int i = 0;
    while (i < 2 * np) {
      mS[++i] = mP[i];
      mSMate[i] = mPMate[i];
    }
    int j = 0;
    while (j < 2 * nq) {
      mS[++i] = mQ[j];
      mSMate[i] = mQMate[j++] + 2 * np + 1;
    }
  }

  protected boolean parenthesisPairs(final int n) {
    int ex = -1;
    int prc = -1;
    for (int i = 1; i <= 2 * n; ++i) {
      if (mP[i] == 0) {
        mStack1[++ex] = i;
        prc += 2;
        mPrPos[prc] = i;
        mPr[i] = prc;
        mStack2[ex] = prc;
      } else {
        mPMate[i] = mStack1[ex];
        mPMate[mStack1[ex]] = i;
        mPrPos[mStack2[ex] + 1] = i;
        mPr[i] = mStack2[ex] + 1;
        if (--ex < -1) {
          return true;
        }
      }
    }
    return ex != -1;
  }

  protected void firstParenthesis(final int n) {
    mP[0] = CLOSE_PAREN;
    int i = 0;
    while (i < 2 * n) {
      mP[++i] = OPEN_PAREN;
      mP[++i] = CLOSE_PAREN;
    }
  }

  protected boolean nextParenthesis(final int n) {
    if (n <= 0) {
      return false;
    }
    int i = 2 * n;
    int exc = 0;
    while (mP[i] == CLOSE_PAREN) {
      --i;
      ++exc;
    }
    while (mP[i] == OPEN_PAREN) {
      --i;
      --exc;
    }
    if (i == 0) {
      return false;
    }
    mP[i] = 0;
    exc += 2;
    while (exc > 0) {
      mP[++i] = CLOSE_PAREN;
      --exc;
    }
    while (i < 2 * n) {
      mP[++i] = OPEN_PAREN;
      mP[++i] = CLOSE_PAREN;
    }
    return true;
  }

  protected void firstBracket(final int n) {
    int i = -1;
    while (i < 2 * n - 1) {
      mQ[++i] = OPEN_BRACKET;
      mQ[++i] = CLOSE_BRACKET;
    }
  }

  protected boolean nextBracket(final int n) {
    if (n <= 0) {
      return false;
    }
    int i = 2 * n - 1;
    int exc = 0;
    while (mQ[i] == CLOSE_BRACKET) {
      --i;
      ++exc;
    }
    while (i >= 0 && mQ[i] == OPEN_BRACKET) {
      --i;
      --exc;
    }
    if (i < 0) {
      return false;
    }
    mQ[i] = OPEN_BRACKET;
    exc += 2;
    while (exc > 0) {
      mQ[++i] = CLOSE_BRACKET;
      --exc;
    }
    while (i < 2 * n - 1) {
      mQ[++i] = OPEN_BRACKET;
      mQ[++i] = CLOSE_BRACKET;
    }
    return true;
  }

  protected boolean bracketPairs(final int n) {
    int ex = -1;
    int prc = -1;
    for (int i = 0; i < 2 * n; ++i) {
      if (mQ[i] == OPEN_BRACKET) {
        mStack1[++ex] = i;
        prc += 2;
        mStack2[ex] = prc;
      } else {
        mQMate[i] = mStack1[ex];
        mQMate[mStack1[ex]] = i;
        mPr[i] = mStack2[ex] + 1;
        if (--ex < -1) {
          return true;
        }
      }
    }
    return ex != -1;
  }

  protected boolean isPair(final int start, final int end, final int openType, final int closeType) {
    if (mS[start] != openType) {
      return false;
    }
    if (mS[end] != closeType) {
      return false;
    }
    int open = 0;
    for (int k = start + 1; k < end; ++k) {
      if (mS[k] == openType) {
        ++open;
      } else if (mS[k] == closeType && --open < 0) {
        return false;
      }
    }
    return open == 0;
  }

  protected int mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(planarCount(2, ++mN, 1, mN + 1, mVerbose));
  }
}
