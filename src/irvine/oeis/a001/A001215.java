package irvine.oeis.a001;

/**
 * A001215.
 * @author Sean A. Irvine
 */
public class A001215 extends A001212 {

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
        for (int h = i; h <= memberCount; ++h) {
          final int s3 = s2 + workspace[h];
          increment(s3);
          for (int g = h; g <= memberCount; ++g) {
            final int s4 = s3 + workspace[g];
            increment(s4);
          }
        }
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
        for (int h = i; h <= memberCount; ++h) {
          final int s3 = s2 + workspace[h];
          decrement(s3);
          for (int g = h; g <= memberCount; ++g) {
            final int s4 = s3 + workspace[g];
            decrement(s4);
          }
        }
      }
    }
    decrement(k);
  }
}

