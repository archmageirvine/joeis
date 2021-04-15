package irvine.oeis.a030;

/**
 * A030327 a(n) is the least k such that the base-2 representation of n begins at s(k) in A030324.
 * @author Sean A. Irvine
 */
public class A030327 extends A030320 {

  /** Construct the sequence. */
  public A030327() {
    super(new A030324(), 0);
  }
}

