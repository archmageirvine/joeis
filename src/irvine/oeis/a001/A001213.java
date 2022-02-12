package irvine.oeis.a001;

/**
 * A001213 a(n) is the solution to the postage stamp problem with n denominations and 3 stamps.
 * @author Sean A. Irvine
 */
public class A001213 extends A001212 {

  @Override
  protected void add(final int[] workspace, final int memberCount, final int k) {
    workspace[memberCount] = k;
    increment(k);
    for (int j = 0; j <= memberCount; ++j) {
      final int sum = k + workspace[j];
      increment(sum);
      for (int i = j; i <= memberCount; ++i) {
        final int s2 = sum + workspace[i];
        increment(s2);
      }
    }
  }

  @Override
  protected void remove(final int[] workspace, final int memberCount, final int k, final int fg) {
    for (int j = 0; j <= memberCount; ++j) {
      final int sum = k + workspace[j];
      decrement(sum);
      for (int i = j; i <= memberCount; ++i) {
        final int s2 = sum + workspace[i];
        decrement(s2);
      }
    }
    decrement(k);
  }
}

