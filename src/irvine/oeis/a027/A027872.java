package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.PartialProductSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a024.A024049;

/**
 * A027872 a(n) = Product_{i=1..n} (5^i - 1).
 * @author Sean A. Irvine
 */
public class A027872 extends PartialProductSequence {

  /** Construct the sequence. */
  public A027872() {
    super(new PrependSequence(new A024049().skip(1), Z.ONE));
  }
}
