package irvine.oeis.a023;

/**
 * A023098 a(n) is least k such that k and 6k are anagrams in base n (written in base 10).
 * @author Sean A. Irvine
 */
public class A023098 extends A023094 {

  @Override
  protected int multiple() {
    return 6;
  }
}
