package irvine.oeis.a062;

import irvine.math.group.GaloisField;
import irvine.oeis.a002.A002884;
import irvine.oeis.a058.A058502;

/**
 * A062250 Number of cyclic subgroups of Chevalley group A_n(2) (the group of nonsingular n X n matrices over GF(2) ).
 * @author Sean A. Irvine
 */
public class A062250 extends A058502 {

  /** Construct the sequence. */
  public A062250() {
    super(new GaloisField(2), new A002884().skip(1));
  }
}
