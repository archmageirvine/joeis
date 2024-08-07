package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.a005.A005839;

/**
 * A071711 Let s(k) denote the k-th term of an integer sequence such that s(0)=0 and s(i) for all i&gt;0 is the least natural number such that no four elements of {s(0),..,s(i)} are in arithmetic progression. Then it appears that there are many set of 3 consecutive integers in s(k). Sequence gives the smallest element in those triples.
 * @author Sean A. Irvine
 */
public class A071711 extends A005839 {

  private Z mA = super.next();
  private Z mB = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      mA = mB;
      mB = super.next();
      if (mB.subtract(t).equals(Z.TWO)) {
        return t;
      }
    }
  }
}
