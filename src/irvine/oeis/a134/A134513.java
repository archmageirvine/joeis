package irvine.oeis.a134;

import irvine.math.z.Z;
import irvine.oeis.a049.A049310;
import irvine.oeis.a097.A097806;
import irvine.oeis.transform.SimpleTransformSequence;
import irvine.oeis.triangle.Product;

/**
 * A134513 Triangle read by rows: T(n, k) = binomial(ceiling((n+k)/2), floor((n-k)/2)).
 * @author Georg Fischer
 */
public class A134513 extends Product {

  /** Construct the sequence. */
  public A134513() {
    super(1, new SimpleTransformSequence(new A049310(), Z::abs), new A097806());
  }
}
