package irvine.oeis.a069;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069404 Half the number of n X 4 binary arrays with a path of adjacent 1's and a path of adjacent 0's from top row to bottom row.
 * @author Sean A. Irvine
 */
public class A069404 extends Sequence1 {

  // We first determine a set of possible states for a given row of the array.
  // We use 0 and 1 denote a 0 and 1 with a path to the top and
  // A and B for a 0 and 1 without a path to the top.
  // Clearly, any valid state will contain at least one 0 and at least one 1.
  // Further, no A will be adjacent to a 0 and no B will be adjacent to a 1.
  //
  // Next we determine the set of possible transitions between these states.
  // Not all transitions are symmetrical. For example, the transition
  // 1001 -> 1000 is possible, but the other way is not as the final 1 in 1001
  // cannot be guaranteed to be connected.
  //
  // From the transition matrix it is easy to do the required counting.

  private static final char[] BITS = {'0', '1', 'A', 'B'};
  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final List<String> mStates = buildStates();
  private final boolean[][] mTransitions = buildTransitionMatrix(mStates);
  private int mN = 0;
  {
    if (mVerbose) {
      dumpAsDot(mStates, mTransitions);
    }
  }

  private static boolean isValidState(final String s) {
    if (!s.contains("0")) {
      return false;
    }
    if (!s.contains("1")) {
      return false;
    }
    for (int k = 0; k < s.length(); ++k) {
      if (s.charAt(k) == 'A') {
        if (k > 0 && s.charAt(k - 1) == '0') {
          return false;
        }
        if (k < s.length() - 1 && s.charAt(k + 1) == '0') {
          return false;
        }
      }
      if (s.charAt(k) == 'B') {
        if (k > 0 && s.charAt(k - 1) == '1') {
          return false;
        }
        if (k < s.length() - 1 && s.charAt(k + 1) == '1') {
          return false;
        }
      }
    }
    return true;
  }

  private static List<String> buildStates() {
    final ArrayList<String> allowedStates = new ArrayList<>();
    for (final char a : BITS) {
      for (final char b : BITS) {
        for (final char c : BITS) {
          for (final char d : BITS) {
            final String s = String.valueOf(a) + b + c + d;
            if (isValidState(s)) {
              allowedStates.add(s);
            }
          }
        }
      }
    }
    return allowedStates;
  }

  private static boolean isValidTransition(final String from, final String to) {
    if (from.equals(to)) {
      return true; // Always can transition to self
    }
    // An "A" cannot be below a "0" and a "B" cannot be below a "1"
    for (int k = 0; k < from.length(); ++k) {
      if (from.charAt(k) == '0' && to.charAt(k) == 'A') {
        return false;
      }
      if (from.charAt(k) == '1' && to.charAt(k) == 'B') {
        return false;
      }
    }
    // There needs to be at least one place where 0 -> 0 and a place where 1 -> 1
    boolean saw0 = false;
    boolean saw1 = false;
    for (int k = 0; k < from.length(); ++k) {
      if (from.charAt(k) == '0' && to.charAt(k) == '0') {
        saw0 = true;
      }
      if (from.charAt(k) == '1' && to.charAt(k) == '1') {
        saw1 = true;
      }
      if (from.charAt(k) == '0' && to.charAt(k) == 'A') {
        return false;
      }
      if (from.charAt(k) == '1' && to.charAt(k) == 'B') {
        return false;
      }
    }
    if (!saw0 || !saw1) {
      return false;
    }
    // Every 0 or 1 in "to" must be connected to a corresponding value in "from"
    for (int k = 0; k < from.length(); ++k) {
      if (to.charAt(k) == '0') {
        boolean ok = false;
        for (int j = k; j < from.length() && to.charAt(j) == '0'; ++j) {
          if (from.charAt(j) == '0') {
            ok = true;
            break;
          }
        }
        if (!ok) {
          for (int j = k - 1; j >= 0 && to.charAt(j) == '0'; --j) {
            if (from.charAt(j) == '0') {
              ok = true;
              break;
            }
          }
        }
        if (!ok) {
          return false;
        }
      } else if (to.charAt(k) == '1') {
        boolean ok = false;
        for (int j = k; j < from.length() && to.charAt(j) == '1'; ++j) {
          if (from.charAt(j) == '1') {
            ok = true;
            break;
          }
        }
        if (!ok) {
          for (int j = k - 1; j >= 0 && to.charAt(j) == '1'; --j) {
            if (from.charAt(j) == '1') {
              ok = true;
              break;
            }
          }
        }
        if (!ok) {
          return false;
        }
      }
    }
    return true;
  }

  private boolean[][] buildTransitionMatrix(final List<String> states) {
    final boolean[][] m = new boolean[states.size()][states.size()];
    for (int from = 0; from < states.size(); ++from) {
      for (int to = 0; to < states.size(); ++to) {
        if (isValidTransition(states.get(from), states.get(to))) {
          m[from][to] = true;
        }
      }
    }
    return m;
  }

  private void dumpAsDot(final List<String> states, final boolean[][] m) {
    System.out.println("digraph G {");
    System.out.println("  mindist=0.8;");
    System.out.println("  node [shape=none, margin=0, fontsize=24];");
    final int len = states.size();
    for (final String state : states) {
      System.out.println("  \"" + state + "\";");
    }
    for (int j = 0; j < len; ++j) { // Next state
      for (int i = 0; i < len; ++i) { // Previous state
        if (i == j) {
          continue; // Don't bother showing the loops
        }
        if (m[i][j]) {
          final boolean bidirectional = m[j][i];
          if (bidirectional) {
            if (j <= i) {
              System.out.println("  \"" + states.get(i) + "\" -> \"" + states.get(j) + "\" [dir=both color=red];");
            }
          } else {
            System.out.println("  \"" + states.get(i) + "\" -> \"" + states.get(j) + "\" [color=blue];");
          }
        }
      }
    }
    System.out.println("}");
    //System.exit(0);
  }

  @Override
  public Z next() {
    Z[] v = new Z[mStates.size()];
    for (int k = 0; k < v.length; ++k) {
      final String s = mStates.get(k);
      v[k] = s.contains("A") || s.contains("B") ? Z.ZERO : Z.ONE;
    }
    ++mN;
    for (int k = 1; k < mN; ++k) {
      final Z[] next = new Z[v.length];
      Arrays.fill(next, Z.ZERO);
      for (int i = 0; i < v.length; ++i) { // Previous state
        for (int j = 0; j < v.length; ++j) { // Next state
          if (mTransitions[i][j]) {
            next[j] = next[j].add(v[i]);
          }
        }
      }
      v = next;
    }
    return Functions.SUM.z(v).divide2();
  }
}

