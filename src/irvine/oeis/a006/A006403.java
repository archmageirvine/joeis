package irvine.oeis.a006;

import irvine.math.z.Z;

/**
 * A006403 Number of 2-connected planar maps with n edges.
 * @author Sean A. Irvine
 */
public class A006403 extends A006385 {

  /** Construct the sequence. */
  public A006403() {
    super(1);
  }

  static boolean hasCutVertex(final int e, final int[] s) {
    for (int k = 1; k <= 2 * e; ++k) {
      if (s[k] == OPEN_BRACKET || s[k] == OPEN_PAREN) {
        int bopen = s[k] == OPEN_BRACKET ? 1 : 0;
        int popen = 1 - bopen;
        for (int j = k + 1; j <= 2 * e; ++j) {
          if (popen < 0 || bopen < 0) {
            break;
          }
          if (popen == 0 && bopen == 0) {
            if (k != 1 || j != 2 * e) {
              return true;
            }
          }
          switch (s[j]) {
            case OPEN_BRACKET:
              ++bopen;
              break;
            case CLOSE_BRACKET:
              --bopen;
              break;
            case OPEN_PAREN:
              ++popen;
              break;
            case CLOSE_PAREN:
              --popen;
              break;
            default:
              throw new RuntimeException();
          }
        }
      }
    }
    return false;
  }

  @Override
  protected boolean reject(final int e) {
    // Check for a cut-vertex
    return hasCutVertex(e, mS);
  }

  private int mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ZERO;
    }
    return Z.valueOf(planarCount(2, mN, 2, mN, mVerbose));
  }
}
