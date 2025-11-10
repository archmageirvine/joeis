package irvine.oeis.a079;

import irvine.oeis.gf.GfSequence;

/**
 * A079105 Number of permutations of length n, in which all monotone subsequences of length 4 are descending or all such subsequences are ascending, containing the minimum number of such subsequences subject to that constraint.
 * @author Sean A. Irvine
 */
public class A079105 extends GfSequence {

  /** Construct the sequence. */
  public A079105() {
    super(0, "1+x*(432*x^16+864*x^15+432*x^14+2710*x^13+4124*x^12+82*x^11-5128*x^10-7856*x^9-1458*x^8-1678*x^7-860*x^6-300*x^5-84*x^4-21*x^3-6*x^2-2*x-1)/((x-1)*(x^2+x+1))");
  }
}
