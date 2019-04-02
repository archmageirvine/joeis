package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017108 a(n) = (8*n+3)^8.
 * @author Sean A. Irvine
 */
public class A017108 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017108() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {6561, 214358881, 16983563041L, 282429536481L, 2251875390625L, 11688200277601L, 45767944570401L, 146830437604321L, 406067677556641L});
  }
}
