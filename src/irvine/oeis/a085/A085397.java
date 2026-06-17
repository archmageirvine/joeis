package irvine.oeis.a085;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a007.A007916;

/**
 * A085397 Numbers that are not perfect powers and whose squarefree part is not congruent to 1 (mod 4).
 * @author Sean A. Irvine
 */
public class A085397 extends FilterSequence {

  /** Construct the sequence. */
  public A085397() {
    super(1, new A007916(), k -> Functions.CORE.z(k).mod(4) != 1);
  }
}
