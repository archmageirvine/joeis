package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.PartialProductSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a024.A024075;

/**
 * A027875 a(n) = Product_{i=1..n} (7^i - 1).
 * @author Sean A. Irvine
 */
public class A027875 extends PartialProductSequence {

  /** Construct the sequence. */
  public A027875() {
    super(new PrependSequence(new SkipSequence(new A024075(), 1), Z.ONE));
  }
}
