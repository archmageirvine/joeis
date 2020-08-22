package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.PartialProductSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a024.A024101;

/**
 * A027877 a(n) = Product_{i=1..n} (9^i - 1).
 * @author Sean A. Irvine
 */
public class A027877 extends PartialProductSequence {

  /** Construct the sequence. */
  public A027877() {
    super(new PrependSequence(new SkipSequence(new A024101(), 1), Z.ONE));
  }
}
