package irvine.oeis.a023;

/**
 * A023096 Least k such that k and 4k are anagrams in base n (written in base 10).
 * @author Sean A. Irvine
 */
public class A023096 extends A023094 {

  /** Construct the sequence. */
  public A023096() {
    super(5);
  }

  @Override
  protected int multiple() {
    return 4;
  }
}
