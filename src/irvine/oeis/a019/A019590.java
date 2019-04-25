package irvine.oeis.a019;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000004;

/**
 * A019590 Fermat's Last Theorem: <code>a(n) = 1</code> if <code>x^n + y^n = z^n</code> has a nontrivial solution in integers, otherwise <code>a(n) = 0</code>.
 * @author Sean A. Irvine
 */
public class A019590 extends PrependSequence {

  /** Construct the sequence. */
  public A019590() {
    super(new A000004(), Z.ONE, Z.ONE);
  }
}
