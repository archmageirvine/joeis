package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042542 Numerators of continued fraction convergents to sqrt(800).
 * @author Sean A. Irvine
 */
public class A042542 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042542() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 39202, 0, 0, 0, 0, 0, 0, 0}, new long[] {28, 85, 113, 198, 2687, 2885, 5572, 19601, 1103228, 3329285, 4432513, 7761798, 105335887, 113097685, 218433572, 768398401});
  }
}
