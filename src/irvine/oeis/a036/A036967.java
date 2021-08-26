package irvine.oeis.a036;

/**
 * A036967 4-full numbers: if a prime p divides k then so does p^4.
 * @author Sean A. Irvine
 */
public class A036967 extends A036966 {

  @Override
  protected int minExponent() {
    return 4;
  }
}
