package irvine.oeis.a392;

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a052.A052486;
import irvine.oeis.a391.A391115;

/**
 * A392134 allocated for Michael De Vlieger.
 * @author Sean A. Irvine
 */
public class A392134 extends IntersectionSequence {

  /** Construct the sequence. */
  public A392134() {
    super(1, new A391115(), new A052486());
  }
}
