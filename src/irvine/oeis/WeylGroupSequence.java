package irvine.oeis;
// 2020-08-23, Georg Fischer

import irvine.oeis.transform.EulerTransform;

/**
 * Sequences with the names <code>Number of reduced words of length n in the Weyl group X_d</code>,
 * where the type X is in A, B, or D, and the group order is d.
 * @author Georg Fischer
 */
public class WeylGroupSequence extends EulerTransform {

  /**
   * Construct the sequence. by reducing it to the {@link EulerTransform} 
   * of a finite sequence padded with zeroes.
   * @param groupType A, B, or D.
   * @param d dimension of the group
   */
  public WeylGroupSequence(final String groupType, final int d) {
    super(new PaddingSequence(initialTerms(groupType, d), new long[] { 0 }), 1);
  }

  /**
   * Create initial terms suitable for the {@link EulerTransform}.
   * @param groupType A, B, or D.
   * @param d dimension of the group
   */
  private static long[] initialTerms(final String groupType, final int d) {
    final char typeCode = groupType.charAt(0);
    long[] result = null;
    switch (typeCode) {
      case 'A':
        result = new long[d + 1];
        for (int i = 0; i <= d; ++i) {
          result[i] = -1;
        }
        result[0] = d;
        break;
      case 'B':
        result = new long[2 * d];
        for (int i = 0; i < d; ++i) {
          result[2 * i] = 0;
          result[2 * i + 1] = -1;
        }
        result[0] = d;
        break;
      case 'D':
        result = new long[2 * (d - 1)];
        for (int i = 0; i < d - 1; ++i) {
          result[2 * i] = 0;
          result[2 * i + 1] = -1;
        }
        result[0] = d;
        if (d % 2 == 0) { // even d
          result[d - 1] = -2;
        } else { // odd d
          result[d - 1] = -1;
        }
        break;  
      default:
        throw new RuntimeException("Unexpected typeCode " + typeCode);
    } // switch typeCode
    return result;
  }

}
