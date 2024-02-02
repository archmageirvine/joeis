package irvine.oeis.a068;

import irvine.math.z.Z;

/**
 * A068174 Define an increasing sequence as follows. Start with an initial term, the seed (which need not have the property of the sequence); subsequent terms are obtained by inserting/placing at least one digit in the previous term to obtain the smallest number with the given property. This is the prime sequence with the seed a(1) = 9.
 * @author Sean A. Irvine
 */
public class A068174 extends A068166 {

  /** Construct the sequence. */
  public A068174() {
    super(Z.NINE);
  }
}
