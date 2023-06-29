package irvine.oeis.a019;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000004;

/**
 * A019590 Fermat's Last Theorem: a(n) = 1 if x^n + y^n = z^n has a nontrivial solution in integers, otherwise a(n) = 0.
 * @author Sean A. Irvine
 */
public class A019590 extends PrependSequence {

  /** Construct the sequence. */
  public A019590() {
    super(1, new A000004(), Z.ONE, Z.ONE);
  }
}
