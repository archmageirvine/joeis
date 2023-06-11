package irvine.oeis.a064;

/**
 * A064066 n-th step is to add a(n) to each previous number a(k) (excluding itself, i.e., k &lt; n) to produce n more terms of the sequence, starting with a(0)=1, a(1)=1.
 * @author Sean A. Irvine
 */
public class A064066 extends A064065 {

  /** Construct the sequence. */
  public A064066() {
    super(1, 1);
  }
}
