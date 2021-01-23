package irvine.oeis.a031;

/**
 * A031241 a(n)=least k such that base 5 representation of n begins at s(k), where s=A031235.
 * @author Sean A. Irvine
 */
public class A031241 extends A031225 {

  /** Construct the sequence. */
  public A031241() {
    super(new A031235(), -1);
  }
}

