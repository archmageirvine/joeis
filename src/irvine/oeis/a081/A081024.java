package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;

/**
 * A081024 Complement of A081023: actual locations of "t" in this wholly inaccurate variation of the Aronson sentence: "T is the second, third, fifth, sixth, seventh . . . letter of this sentence, not counting commas or spaces".
 * @author Sean A. Irvine
 */
public class A081024 extends ComplementSequence {

  /** Construct the sequence. */
  public A081024() {
    super(1, Z.ONE, new A081023());
  }
}

