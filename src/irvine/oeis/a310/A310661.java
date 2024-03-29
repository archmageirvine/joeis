package irvine.oeis.a310;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A310661 Coordination sequence Gal.3.7.2 where Gal.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A310661 extends TilingSequence {

  /** Construct the sequence. */
  public A310661() {
    super(0, new String[]
        { "12.12.3;B180-1,A180+2,B120+1"
        , "12.4.3.3;A180-1,B120-2,C270-3,B60-4"
        , "6.4.3.4;C60+2,C300+1,B270-3,B210+3"
        });
    defineBaseSet(1);
  }
}
