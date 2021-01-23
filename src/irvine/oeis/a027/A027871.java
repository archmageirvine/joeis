package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.PartialProductSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a024.A024023;

/**
 * A027871 a(n) = Product_{i=1..n} (3^i - 1).
 * @author Sean A. Irvine
 */
public class A027871 extends PartialProductSequence {

  /** Construct the sequence. */
  public A027871() {
    super(new PrependSequence(new SkipSequence(new A024023(), 1), Z.ONE));
  }
}
