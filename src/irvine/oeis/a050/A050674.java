package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A050674 Inserting a digit '0' between adjacent digits of n makes a prime.
 * @author Sean A. Irvine
 */
public class A050674 implements Sequence {

  private long mN = 9;
  private final char mInsert;

  protected A050674(final char insert) {
    mInsert = insert;
  }

  /** Construct the sequence. */
  public A050674() {
    this('0');
  }

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      final String s = String.valueOf(mN);
      if (s.charAt(s.length() - 1) != '5') {
        final StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));
        for (int k = 1; k < s.length(); ++k) {
          sb.append(mInsert).append(s.charAt(k));
        }
        if (new Z(sb).isProbablePrime()) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
