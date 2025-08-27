package irvine.oeis.a079;

import irvine.math.z.Z;
import irvine.oeis.NoncomputableSequence;

/**
 * A079794 Smallest number having k digits "k" (k=1,...,n) but any two adjacent digits are different.
 * @author Sean A. Irvine
 */
public class A079794 extends NoncomputableSequence {

  // Further terms have representational issues.

  /** Construct the sequence. */
  public A079794() {
    super(1, NONCOMPUTABLE, Z.ONE, Z.valueOf(212), Z.valueOf(132323), Z.valueOf(1234243434), Z.valueOf(123234535454545L), new Z("123234345464656565656"), new Z("1232343454545657576767676767"), new Z("123234345454565656767868687878787878"), new Z("123234345454565656767676787897979898989898989"));
  }
}

