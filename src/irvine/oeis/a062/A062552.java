package irvine.oeis.a062;

import irvine.math.group.GaloisField;
import irvine.math.z.Z;
import irvine.oeis.a053.A053291;
import irvine.oeis.a058.A058502;

/**
 * A062552 Number of cyclic subgroups of Chevalley group A_n(4) (the group of nonsingular n X n matrices over GF(4) ).
 * @author Sean A. Irvine
 */
public class A062552 extends A058502 {

  /** Construct the sequence. */
  public A062552() {
    super(new GaloisField(Z.TWO, 2), new A053291().skip(1));
  }
}
