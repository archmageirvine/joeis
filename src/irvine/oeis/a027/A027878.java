package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.PartialProductSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a002.A002283;

/**
 * A027878 a(n) = Product_{i=1..n} (10^i - 1).
 * @author Sean A. Irvine
 */
public class A027878 extends PartialProductSequence {

  /** Construct the sequence. */
  public A027878() {
    super(new PrependSequence(new SkipSequence(new A002283(), 1), Z.ONE));
  }
}
