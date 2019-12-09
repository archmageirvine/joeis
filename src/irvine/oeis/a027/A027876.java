package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.PartialProductSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a024.A024088;

/**
 * A027876 <code>a(n) = Product_{i=1..n} (8^i - 1)</code>.
 * @author Sean A. Irvine
 */
public class A027876 extends PartialProductSequence {

  /** Construct the sequence. */
  public A027876() {
    super(new PrependSequence(new SkipSequence(new A024088(), 1), Z.ONE));
  }
}
