package irvine.oeis.a286;

import irvine.math.z.Z;
import irvine.oeis.transform.TupleTransformSequence;

/**
 * A286840 One of the two successive approximations up to 13^n for 13-adic integer sqrt(-1). Here the 5 (mod 13) case (except for n=0).
 * @author Georg Fischer
 */
public class A286840 extends TupleTransformSequence {

  /** Construct the sequence. */
  public A286840() {
    this(0, 2, 1, 9, 13, "0,5");
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param ipow power
   * @param iadd additive parameter
   * @param imult multiplicative parameter
   * @param iadic expansion for p-adic integer
   * @param init two initial terms
   */
  public A286840(final int offset, final int ipow, final int iadd, final int imult, final int iadic, final String init) {
    super(offset, (n, s) -> s[0].add(s[0].pow(ipow).add(iadd).multiply(imult)).mod(Z.valueOf(iadic).pow(n)), init, PREVIOUS, PREVIOUS);
  }
}
