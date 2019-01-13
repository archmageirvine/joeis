package irvine.oeis.a167;

import irvine.math.z.Z;
import irvine.oeis.LinearRecurrence;

/**
 * A167879.
 * @author Sean A. Irvine
 */
public class A167879 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167879() {
    super(new long[] {-1128, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47},
      new Z[] {Z.ONE, Z.valueOf(49), Z.valueOf(2352), Z.valueOf(112896), Z.valueOf(5419008), Z.valueOf(260112384), Z.valueOf(12485394432L), Z.valueOf(599298932736L), Z.valueOf(28766348771328L), Z.valueOf(1380784741023744L), Z.valueOf(66277667569139712L), Z.valueOf(3181328043318706176L), new Z("152703746079297896448"), new Z("7329779811806299029504"), new Z("351829430966702353416192")});
  }
}
