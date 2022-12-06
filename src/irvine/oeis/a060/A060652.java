package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.a051.A051532;

/**
 * A060652 Orders of non-Abelian groups: n such that some group of order n is non-Abelian.
 * @author Sean A. Irvine
 */
public class A060652 extends ComplementSequence {

  /** Construct the sequence. */
  public A060652() {
    super(new A051532(), Z.ONE);
  }
}
