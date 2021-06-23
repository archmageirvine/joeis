package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.a002.A002371;

/**
 * A048595 Alternative start to A002371, which is the main entry for this sequence.
 * @author Sean A. Irvine
 */
public class A048595 extends A002371 {

  @Override
  public Z next() {
    return Z.ONE.max(super.next());
  }
}

