package irvine.oeis.a031;

/**
 * A031017 a(n)=least k such that the base 7 representation of n begins at s(k), where s=A031016.
 * @author Sean A. Irvine
 */
public class A031017 extends A031006 {

  /** Construct the sequence. */
  public A031017() {
    super(new A031016(), 0);
  }
}

