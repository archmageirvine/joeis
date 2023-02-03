package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030315 Write n in base 2, complement each digit (d -&gt; 1-d) and append the complemented digits to the sequence.
 * @author Sean A. Irvine
 */
public class A030315 extends A030190 {
 
  @Override
  public Z next() {
    return Z.ONE.subtract(super.next());
  }
}
