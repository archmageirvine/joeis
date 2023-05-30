package irvine.oeis.a153;
// manually triprod at 2023-05-29 11:52

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a128.A128064;
import irvine.oeis.a129.A129186;
import irvine.oeis.triangle.Product;

/**
 * A153869 Triangle read by rows, A129186 * A128064(unsigned).
 * @author Georg Fischer
 */
public class A153869 extends Sequence1 {

  private final Product mSeq = new Product(new A129186(), new A128064());

  @Override
  public Z next() {
    return mSeq.next().abs();
  }
}
