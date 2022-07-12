package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.a003.A003329;

/**
 * A057907 Positive integers that are not the sum of precisely six positive cubes.
 * @author Sean A. Irvine
 */
public class A057907 extends ComplementSequence {

  /** Construct the sequence. */
  public A057907() {
    super(new A003329(), Z.ONE);
  }
}
