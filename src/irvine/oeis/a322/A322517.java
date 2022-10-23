package irvine.oeis.a322;
// manually 2021-01-18

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A322517 Primes of form 1357913579... .
 * @author Georg Fischer
 */
public class A322517 extends Sequence1 {
  protected String mConst1; // sequence of digits
  protected int mPos; // position in mConst1
  protected String mTerm; // last valid term

  /**
   * Empty constructor
   */
  public A322517() {
    this("13579");
  }

  /**
   * Constructor for subclasses, with parameter
   * @param const1 constant before k
   */
  protected A322517(final String const1) {
    mConst1 = const1;
    mPos = mConst1.length();
    mTerm = "";
  }

  @Override
  public Z next() {
    Z result;
    do {
      if (mPos >= mConst1.length()) {
        mPos = 0;
      }
      mTerm += mConst1.substring(mPos, mPos + 1);
      mPos++;
      result = new Z(mTerm);
    } while (!result.isProbablePrime());
    return result;
  }
}
