package irvine.oeis.a366;

import irvine.math.function.Functions;
import irvine.oeis.a024.A024075;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A366635 a(n) = phi(7^n-1), where phi is Euler's totient function (A000010).
 * @author Sean A. Irvine
 */
public class A366635 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A366635() {
    super(1, new A024075().skip(), k -> Functions.PHI.z(k));
  }
}

