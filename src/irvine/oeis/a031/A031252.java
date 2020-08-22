package irvine.oeis.a031;

/**
 * A031252 Least k such that base 5 representation of n begins at s(k), where s=A031251.
 * @author Sean A. Irvine
 */
public class A031252 extends A031225 {

  /** Construct the sequence. */
  public A031252() {
    super(new A031251(), 0);
  }
}

