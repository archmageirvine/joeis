package irvine.oeis.a068;

import irvine.math.z.Z;

/**
 * A068171 Define an increasing sequence as follows: Given the first term called the seed (the seed need not have the property of the sequence.), subsequent terms are defined as obtained by inserting/placing digits (at least one) in the previous term to obtain the smallest number with a given property. This is the growing prime sequence for the seed a(1) = 6.
 * @author Sean A. Irvine
 */
public class A068171 extends A068166 {

  /** Construct the sequence. */
  public A068171() {
    super(Z.SIX);
  }
}
