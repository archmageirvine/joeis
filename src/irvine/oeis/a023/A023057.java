package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;

/**
 * A023057 (Apparently) not the difference between adjacent perfect powers (A001597, integers of form a^b, a &gt;= 1, b &gt;= 2).
 * @author Sean A. Irvine
 */
public class A023057 extends ComplementSequence {

  /** Construct the sequence. */
  public A023057() {
    super(new A023055(), Z.SIX);
  }
}
