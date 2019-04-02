package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.a002.A002202;

/**
 * A007617 Values not in range of Euler phi function.
 * @author Sean A. Irvine
 */
public class A007617 extends ComplementSequence {

  /** Construct the sequence. */
  public A007617() {
    super(new A002202(), Z.ONE);
  }
}

