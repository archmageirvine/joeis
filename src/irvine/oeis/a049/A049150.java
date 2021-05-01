package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.PaddingSequence;
import irvine.oeis.RevertTransformSequence;

/**
 * A049150 Recip transform of 2*(1 + x^2)-1/(1-x).
 * 1, 1, 1, 1, 3, 15, 59, 187, 533, 1541, 4893, 16797, 58663, 201347, 679767, 2294967, 7850121, 27247369, 95375225, 334643225, 1174649611, 4129971863, 14570334995, 51610458291, 183436895645, 653582527693, 2333035219285, 8342630973365 (list; graph; refs; listen; history; edit; text; internal format)
 * OFFSET 0, 5
 * Sign diagram of generating sequence: +-+------------...
 *
 * @author Georg Fischer
 */
public class A049150 extends RevertTransformSequence {

  /**
   * Construct the sequence
   */
  public A049150() {
    this(new long[] {+1, -1, +1, -1}, new long[] {-1});
  }

  /**
   * Generic constructor with parameters
   *
   * @param left  initial terms
   * @param right repeated terms that are overlaid by the initial terms
   */
  public A049150(final long[] left, final long[] right) {
    super(new PaddingSequence(left, right));
  }

  @Override
  public Z next() {
    return super.next();
  }
}
