package irvine.oeis.a310;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A310043 Coordination sequence Gal.6.92.1 where Gal.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A310043 extends TilingSequence {

  /** Construct the sequence. */
  public A310043() {
    super(0, new String[]
        { "12.6.4;A180-1,B120-2,C210-2"
        , "12.6.4;D180-1,A120-2,B0-3"
        , "6.4.4.3;C180-1,A210-3,C240-3,E210-2"
        , "12.6.4;B180-1,D120-2,D0-3"
        , "4.3.4.3.3;E300+4,C210-4,C30+4,E60+1,F0+3"
        , "3.3.3.3.3.3;E240+5,E300+5,E0+5,E60+5,E120+5,E180+5"
        });
    defineBaseSet(0);
  }
}
