package irvine.oeis.a386;

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a056.A056808;
import irvine.oeis.a332.A332785;

/**
 * A386224 Nonsquarefree weak numbers k that are not products of primorials, whose squarefree kernel is a primorial.
 * @author Sean A. Irvine
 */
public class A386224 extends IntersectionSequence {

  /** Construct the sequence. */
  public A386224() {
    super(1, new A056808(), new A332785());
  }
}
