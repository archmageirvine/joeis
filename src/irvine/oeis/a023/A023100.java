package irvine.oeis.a023;

/**
 * A023100 a(n) is least k such that k and 8k are anagrams in base n (written in base 10).
 * @author Sean A. Irvine
 */
public class A023100 extends A023094 {

  @Override
  protected int multiple() {
    return 8;
  }
}
