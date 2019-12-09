package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.PartialProductSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a024.A024062;

/**
 * A027873 <code>a(n) = Product_{i=1..n} (6^i - 1)</code>.
 * @author Sean A. Irvine
 */
public class A027873 extends PartialProductSequence {

  /** Construct the sequence. */
  public A027873() {
    super(new PrependSequence(new SkipSequence(new A024062(), 1), Z.ONE));
  }
}
