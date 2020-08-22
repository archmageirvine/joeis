package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.PartialProductSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a024.A024127;

/**
 * A027879 a(n) = Product_{i=1..n} (11^i - 1).
 * @author Sean A. Irvine
 */
public class A027879 extends PartialProductSequence {

  /** Construct the sequence. */
  public A027879() {
    super(new PrependSequence(new SkipSequence(new A024127(), 1), Z.ONE));
  }
}
