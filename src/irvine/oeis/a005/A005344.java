package irvine.oeis.a005;

import irvine.oeis.a001.A001212;

/**
 * A005344.
 * @author Sean A. Irvine
 */
public class A005344 extends A001212 {

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
            for (int f = g; f <= memberCount; ++f) {
              final int s5 = s4 + workspace[f];
              increment(s5);
              for (int e = f; e <= memberCount; ++e) {
                final int s6 = s5 + workspace[e];
                increment(s6);
                for (int d = e; d <= memberCount; ++d) {
                  final int s7 = s6 + workspace[d];
                  increment(s7);
                  for (int c = d; c <= memberCount; ++c) {
                    final int s8 = s7 + workspace[c];
                    increment(s8);
                  }
                }
              }
            }
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
            for (int f = g; f <= memberCount; ++f) {
              final int s5 = s4 + workspace[f];
              decrement(s5);
              for (int e = f; e <= memberCount; ++e) {
                final int s6 = s5 + workspace[e];
                decrement(s6);
                for (int d = e; d <= memberCount; ++d) {
                  final int s7 = s6 + workspace[d];
                  decrement(s7);
                  for (int c = d; c <= memberCount; ++c) {
                    final int s8 = s7 + workspace[c];
                    decrement(s8);
                  }
                }
              }
            }
          }
        }
      }
    }
    decrement(k);
  }
}

