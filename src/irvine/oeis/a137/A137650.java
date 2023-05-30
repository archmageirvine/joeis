package irvine.oeis.a137;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000012;
import irvine.oeis.a008.A008277;
import irvine.oeis.triangle.Product;

/**
 * A137650 Triangle read by rows, A008277 * A000012.
 * @author Georg Fischer
 */
public class A137650 extends Sequence1 {

  private final Sequence mSeq = new Product(new A008277(), new A000012());

  @Override
  public Z next() {
    return mSeq.next();
  }
}
