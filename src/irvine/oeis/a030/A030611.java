package irvine.oeis.a030;

/**
 * A030611 a(n)=least k such that the base 6 representation of n begins at s(k), where s=A030604.
 * @author Sean A. Irvine
 */
public class A030611 extends A030555 {

  /** Construct the sequence. */
  public A030611() {
    super(new A030604().skip(2), 0);
  }
}

